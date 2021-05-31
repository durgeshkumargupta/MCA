import numpy as np
from sklearn import datasets

iris=datasets.load_iris()

x=iris.data[:,:4]
first_mean=np.mean(x[:,1])

print(first_mean)