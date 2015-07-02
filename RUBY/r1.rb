# http://www.geeksforgeeks.org/microsoft-interview-experience-set-56-for-sde-2/
# Find if there exists an anagram of given string in a longer string
def is_ana(str, str2)
	if str.chars.sort.join.eql?str2.chars.sort.join
		answer = true
	else
		answer = false
	end
	return answer
end

input="thisisasethere"
find="stet"
for i in 0...input.length do
	var = is_ana(input[i,find.length], find)
	if var==true
		print "YES\n"
		break
	end
end
if not var
	print "NO\n"
end