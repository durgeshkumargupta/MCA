import matplotlib.pyplot as plt


from sklearn import datasets

iris=datasets.load_iris()

slizeddata_3col=iris.data[:,:3]

slizeddata_col3=iris.data[:,3]

slizeddata_row=iris.data[3,:]

slizeddata_row3col1=iris.data[3,:]

slizeddata_row3col1=iris.data[3,:1]

slizeddata_3row2col=iris.data[:3,:2]

slizeddata_rowcol=iris.data[:3,:2]

#Boxplot

x=iris.data[:,:4]
plt.boxplot(x)
plt.show()


plt.boxplot(x[:,1])
plt.show()

plt.boxplot(x[:,2])
plt.show()
