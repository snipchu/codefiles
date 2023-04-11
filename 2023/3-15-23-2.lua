-- This lua code converts Celcius to Fahrenheit and vice versa
-- Also a solution to an assignment in my python class

local function getinput(text)
	io.write(text)
	return tonumber(io.read())
end

local convert = getinput("Convert °F to °C or convert °C to °F? (1/2): ")

if convert == 1 then
	local degrees = getinput("\nEnter the temperature in Fahrenheit: ")
	print(degrees .. "°F is equal to " .. (degrees - 32) * 5 / 9 .. "°C.")
elseif convert == 2 then
	local degrees = getinput("\nEnter the temperature in Celcius: ")
	print(degrees .. "°C is equal to " .. (degrees * 9 / 5) + 32 .. "°F.")
else
	print("\nNot a valid choice")
end
