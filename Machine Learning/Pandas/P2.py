import pandas as pd
kulfi=['Chocalate','Mango','Vanilla','Strawbarry','kesher']

pd.Series(kulfi)
#_____________________________________

lottory=[2,3,4,5,67,76,4]
pd.Series(lottory)

#__________________________
reg=[True,True,False,True,False]
pd.Series(reg)
reg

#_____________Attribute___________________
men=["Smart","HanSome","Charming","Brilliant","Humble"]
s=pd.Series(men)

#________________
s
s.values

#_____________

print(s.dtype)
