import numpy as np
from sklearn import datasets

iris=datasets.load_iris()

x=iris.data[:,:4]
first_mean=np.mean(x[:,1])

print(first_mean)

np.median(x[:,1])
np.var(x[:,1])
np.std(x[:,1])

np.mean(x[:,2])
np.median(x[:,2])
np.var(x[:,2])
np.std(x[:,2])