#Import CSV File using pandas
import pandas as pd

s1=pd.read_csv("covid-19.csv")

#_____Sort values and replace___________________
test1=pd.read_csv("covid-19.csv",usecols=(["industry"]), squeeze=True)
#_____________________________________
test2=s1.sort_values("industry")
#_______________________
test3=s1.sort_values("description").head()
#___________________________________
test4=s1.sort_values("description").head(7)
#__________________________________
test5=s1.sort_values("description").tail()
#______________________________________
test6=s1.sort_values("description").tail(9)
#____________________________
