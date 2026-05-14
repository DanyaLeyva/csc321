# Danya Leyva
# LAB: 12
# CSC 321

import math

def calc_area_of_rect(base, height):
    area = base * height
    return area

def calc_area_of_circle(radius):
    area = math.pi * (radius ** 2)
    return area

rect_base = float(input("Enter the BASE of the rectangle: "))
rect_height = float(input("Enter the HEIGHT of the rectangle: "))
    
rect_area = calc_area_of_rect(rect_base, rect_height)
print("The area of the rectangle is:", rect_area)

radius = float(input("Enter the RADIUS of the circle: "))
    
circle_area = calc_area_of_circle(radius)
print("The area of the circle is:", circle_area)
