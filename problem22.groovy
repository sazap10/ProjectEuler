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
File file = new File("names.txt");
def regex = "[A-Z]+"
def list= [];
file.withReader{line -> list = line.readLine().findAll(regex)}
list.sort();
def sum = 0;
for(def n = 1;n <= list.size();n++)
{
	def i = n-1;
	def name = alphaValue(list[i]);
	def score = n*name;
	sum+=score;
}
println sum;
