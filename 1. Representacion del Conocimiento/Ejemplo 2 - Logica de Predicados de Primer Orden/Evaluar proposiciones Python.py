def P(x):
    return x % 2 == 0 

x = 4
y = 5

proposicion1 = P(x) and P(y) 
proposicion2 = P(x) or P(y) 
proposicion3 = not P(x) or P(y)  

cuantificacion1 = any(P(i) for i in range(10))
cuantificacion2 = all(P(i) for i in range(10))

print(proposicion1) 
print(proposicion2) 
print(proposicion3)  
print(cuantificacion1)  
print(cuantificacion2) 


