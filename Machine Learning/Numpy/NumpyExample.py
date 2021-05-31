import numpy

#______________one Dimensional Array_________________
arr1D=numpy.array([22,44,55,66,77])
print(arr1D)

#___________________________
import numpy as np
arr=np.array([55,65,45,34,23])
print(arr)
print(type(arr))

#_________________two Dimensional array____________________

arr2D=np.array([[2,3,4,5,6],[4,5,6,7,8]])
print(arr2D)
print(type(arr2D))

#____________________three Dimensional array_______________________________

arr3D1=np.array([[1,2,3],[3,5,6],[4,3,2]])
print(arr3D1)
#____________________________________________
arr3D2=np.array([[1,2,3],[3,5,6],[4,3,2],[5,5,2]])
print(arr3D2)

#_____________Checking for dimensional of array______________________________
a=np.array(42)
b=np.array([77,65,45,34,32,66,45,34])
c=np.array([[[1,2,3],[7,6,5]],[[4,6,4],[7,5,4]]])
print(a.ndim)
print(b.ndim)
print(c.ndim)

#________________________________________________
arr=np.array([1,2,5,4,3,4,2,3,5])
print(arr[2]+arr[5])

#_______________________________________
arr=np.array([[3,4,5,6,9],[1,7,8,5,2]])
print(arr[0,1])
#______________________________________

arr=np.array([2,3,4,5,6,8,9])
print(arr[1:5])

#________________________________
arr=np.array([1,2,3,4,5,6,7,8])
print(arr[4:])










