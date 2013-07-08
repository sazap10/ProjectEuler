def alphaValue(string)
{
	def ALPHA = 64;
	def sum = 0;
	for(char c in string)
	{
		def ascii = (int)c-64;
		sum+=ascii;
	}
	return sum;
}
def isTriangleNum(n)
{
	def c = ((Math.sqrt((8*n)+1))-1)/2;
	if(c - (int)c > 0)
	{
		return false;
	}
	return true;
}
start = System.currentTimeMillis() 
File file = new File("words.txt");
def regex = "[A-Z]+"
def list= [];
file.withReader{line -> list = line.readLine().findAll(regex)}
def total = 0;
for(i in 0..<list.size())
{
	def sum = alphaValue(list[i]);
	if(isTriangleNum(sum))
	{
		total++;
	}
}
now = System.currentTimeMillis()  
println now - start;
println total;
