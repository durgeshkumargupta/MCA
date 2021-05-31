#Method Parameter argument
import pandas as pd
Rate=[3,99,4,54,6,52,5,55,7,91]

r=pd.Series(Rate)

print(r)

#_____________________________
print(r.sum())

#_____________________
print(r.mean())

#_____________________________
kulfi=['Chocalate','Mango','Vanilla','Strawbarry','kesher']
weekdays=["Mon","Tue","Wed","Thu","Fri"]

print(pd.Series(kulfi,weekdays))

print("_______________________________")
print(pd.Series(data=kulfi,index=weekdays))

print("____________________________________")
print(pd.Series(kulfi,index=weekdays))