# Store-Managment-Project

# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

[UML Diagram for my project]![](<Copy of UML Diagram.jpg>)

## Description

For my project, it revolves around the user picking what type of drink they want from the drink shop. The superclass is the Drink class, home to many of the instance variables such as flavor, size, if the drink has boba, and if so, what type. The subclasses included are Milk Tea and Ice Tea. Milk Tea has instance variables which superclass can't access, the type of milk and if it's blended. Same thing as Ice Tea, if it has lemon and if it has extra honey. The user will be interacting with this program by first inputting what type of drink they want through a String. They have an option of Milk Tea, Ice Tea, or other. Once their option is inputted, they are given another option, inputted though boolean, on whether they want the default version of the drink or if they want to create a custom one. If the user inputs false, the program will print the default drink while inputting true leads to the user dictating the type of drink they want. Once the user makes their decision, a summary of their order is returned to them, followed by the program's scanner closing.