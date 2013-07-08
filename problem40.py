string= "";
for i in range(1,1000000):
	string = string+str(i);
	if len(string) >= 1000000:
		break;
		
total = int(string[0]) * int(string[9])*int(string[99])*int(string[999])*int(string[9999])*int(string[99999])*int(string[999999]);
print(total);
