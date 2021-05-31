import numpy as np
import matplotlib.pyplot as plt

t=np.arange(0.0,2.0,0.01)

s=1 + np.cos(2*np.pi*t)

plt.plot(t,s,'')
plt.xlabel('Time(t)')
plt.ylabel('Volatage(mV)')
plt.title('cosine wave plot(Cos(x))')
plt.show()

#_________________________________

t=np.arange(0.0,2.0,0.01)

s=1 + np.cos(2*np.pi*t)

plt.plot(t,s,'--')
plt.xlabel('Time(t)')
plt.ylabel('Volatage(mV)')
plt.title('cosine wave plot(Cos(x))')
plt.show()

#_______________________________
t=np.arange(0.0,2.0,0.01)

s=1 + np.cos(2*np.pi*t)

plt.plot(t,s,'--')
plt.grid()
plt.xlabel('Time(t)')
plt.ylabel('Volatage(mV)')
plt.title('cosine wave plot(Cos(x))')
plt.show()


