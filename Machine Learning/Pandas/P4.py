#Import CSV File using pandas
import pandas as pd

s1=pd.read_csv("covid-19.csv")

#_________________________
s2=pd.read_csv("covid-19.csv")

s3=pd.read_csv("covid-19.csv",usecols=(["industry"]))

#__________Top five object________________
head_method=s2.head()
#____________________________
head_method2=s2.head(10)
#________Last five object_________
tail1=s2.tail()
#_______________________
tails2=s2.tail(8)
#____________________________-
test1=s2.values
#______________________
test2=s2.index
#______________________
#test3=s2.dtype
#________________________
#test4=s2.is_unique
#__________________
test5=s2.ndim
#________________
test6=s2.size
#________________
#test7=s2.name
#__ Change name of a file temporary________________
#test8=s2.name="Covid"
