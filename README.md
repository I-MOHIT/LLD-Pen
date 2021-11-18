# Design A Pen

## This is a LLD Discussion Problem. We are given a very abstract problem to design a pen. The requirements need to be gathered from the interviewer and on the basis of the discussion the design should be implemented.

#### The entities (classes and interfaces) that can be thought of for such a problem could be as follows - 

- Pen (Abstract Class)
- Ink Pen
- Ball Pen
- Refill Pipe
- Nib
- Ink
- Chalk
- Pencil

#### Note - The last two are entities which are not pen but yet implement the writable interface

#### The writable interface has been used to keep scope for future expansion and implementation of pen type objects such as Sketch Pen, Marker Pen, etc.

---
# Class Diagram

![Alt text](./Pen_ClassDiagram.jpg?raw=true "Class Diagram")