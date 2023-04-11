-- This lua code is a solution to an assignment in my python class
-- It asks how many numbers you want to check are divisble by 3
-- then prints how many were (not) divisible by 3

-- get input as a function (bc im lazy)
local function getinput(text)
	io.write(text)
	return tonumber(io.read())
end

--instantiate variables
local counter = getinput("How many numbers do you need to check?: ")
local divisible = 0

-- for loop that gets number, then check if divisible by 3
for i = 1, counter, 1 do
	local tempvar = getinput("\nEnter number: ")
	if tempvar % 3 == 0 then
		print(tempvar .. " is divisible by 3")
		divisible = divisible + 1
	else
		print(tempvar .. " is not divisible by 3")
	end
end

-- output results
print("\nYou entered " .. divisible .. " numbers that were divisible by 3")
print("You entered " .. counter - divisible .. " numbers that were not divisible by 3")
