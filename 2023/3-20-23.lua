-- This lua code prints out a desired amount of numbers to the fibonacci sequence

-- get input
io.write("How many numbers do you want?: ")
local nthnum = tonumber(io.read())

-- first 2 nums of fib sequence
local nums = { 0, 1 }
print(nums[1])
print(nums[2])

-- print 3rd number, update -> second and third nums of sequence
for i = 1, nthnum, 1 do
	print(nums[1] + nums[2])
	nums = { nums[2], nums[1] + nums[2] }
end
