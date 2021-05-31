import pandas as pd

s1=pd.read_csv("Google_Stock_Price_Train.csv")
#__________________________________
test1=pd.read_csv("Google_Stock_Price_Train.csv",squeeze=True)
#_______________________________
test2=s1.head()
#_______________________________
test3=s1.sort_values("Close")
#__________________________
test4=s1.sort_values("Volume",ascending=True)
#_________________________________
test5=s1.sort_values("Volume",ascending=False)
#________________________________
test6=s1.sort_values("Close",ascending=False,inplace=True)
#_________________________________
test7=s1.sort_index(ascending=False)
#_________________________________
test8=s1.sort_index(ascending=True)
#____________________________________
test9=s1.sort_index()
#__________________________
test10=s1.sort_index(ascending=True,inplace=True) 
#__________________________
test11=s1.sort_index(ascending=True,inplace=True) 
#________________________________
test12=s1[5:10]
#__________________
test13=s1[95:100]






