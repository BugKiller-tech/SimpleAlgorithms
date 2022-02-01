'''
Given an array heights taht contains the height of each bar in the histogram,
and we are asked to return the area of the largest rectangle in the histogram.jNote that eachbar has a width of 1.
'''

def largest_rectangle(heights):
  max_area = 0
  
  for i in range(len(heights)):
    left = i
    right = i
    while left-1 >= 0 and heights[left-1] >= heights[i]:
      left -= 1
    while right+1 < len(heights) and heights[right+1] >= heights[i]:
      right += 1
    max_area = max(max_area, (right - left - 1) * heights[i])
  return max_area
