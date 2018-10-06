# Write your code here
N=map(int,raw_input().split())
arr=map(int,raw_input().split())
s=0 #To save the sum
l=0 #To save the result
if (max(arr)<0 and min(arr)<0):
    s=max(arr)
    l=1
else:
    for a in arr:
        if a>=0:
            s+=a
            l+=1
print s,l
