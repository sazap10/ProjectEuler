pythTrip(A,B,C):- A1 is A*A,B1 is B*B,C1 is C*C,C1 is A1+B1.
prod(N):- pythTrip(A,B,C),D is 1000, D is A+B+C,N is A*B*C.
