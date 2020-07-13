
t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
   
    dic = {}
   
    m = a+b
    for x in m:
        if x not in dic:
            dic[x] = 1
        else:
            dic[x] += 1
    label = False    
    ideal = []
    for k in dic:
        if dic[k]%2==0:
            ideal += [k]*(dic[k]//2)
        else:
            print(-1)
            label = True
            break
       
    if label==False:
        dica = {}
        dicb = {}
        for x in a:
            if x not in dica:
                dica[x]=1
            else:
                dica[x]+=1
               
        for x in b:
            if x not in dicb:
                dicb[x]=1
            else:
                dicb[x]+=1
               
        dici = {}
        for x in ideal:
            if x not in dici:
                dici[x]=1
            else:
                dici[x]+=1
               
        needa = []
        needb = []
       
        for k in dica:
            if k in dici:
                needa += [k]*(dica[k]-dici[k])
        for k in dicb:
            if k in dici:
                needb += [k]*(dicb[k]-dici[k])
       
        if len(needa)==0 or len(needb)==0:
            label = True
            print(0)
           
        if label==False:        
            needa.sort()
            needb.sort(reverse = True)
            ans = 0
            x = 2*min(ideal)
           
            for i in range(len(needa)):
                ans += min(x,needa[i],needb[i])
            print(ans)

       
       
           
       
    
