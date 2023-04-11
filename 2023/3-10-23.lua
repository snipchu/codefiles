-- This lua code is a solution to an assignment in my python class
-- It takes in input for some of the sides to a irregular shape
-- Then it prints out the area and perimeter of the shape based on those measurements

-- this function asks for side input and reads the input
local function getsides(letter)
	io.write("Enter side " .. letter .. ": ")
	return io.read()
end

-- assigning sides to variables
local sideA = getsides("A")
local sideB = getsides("B")
local sideC = getsides("C")
local sideD = getsides("D")
local sideE = getsides("E")
local sideF = sideD - sideB - sideE
local sideG = sideA - sideC

-- determine area and perimeter
local area = (sideA * sideB) + (sideF * sideG) + ((sideE * sideG) / 2)
local perimeter = math.floor(sideA + sideB + sideD + sideC + sideF + math.sqrt(sideE * sideE + sideG * sideG))

-- print results
print("Land area: " .. area .. " square feet")
print("Land perimeter: " .. perimeter .. " feet")
