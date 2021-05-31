import pandas as pd

sample_set=({
    "student":["Durgesh","Prince","Adity","Ayush","Lucky"],
    "ML_Marks":[66,77,67,44,87]
    })

myvar=pd.DataFrame(sample_set)

print(myvar)

#add one index over this 
df=pd.DataFrame(sample_set,index = ["RVCE20MCA064","RVCE20MCA065",
                                  "RVCE20MCA066","RVCE20MCA067",
                                  "RVCE20MCA068"
                                 ])
print(myvar)
print(df)