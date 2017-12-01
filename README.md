# SSC5793

Projects developed during Software Reuse (SSC5793) class at ICMC


## Service oriented architecture

Two simple projects were developed in order to verify the applicability of the approach:

1) A simple implementation of webservice using REST to check if a given brazilian CPF (individual registration
) number  is valid.

There are two versions:

- First one verify the CPF number as simple string
- Second one verifies the CPF number designed into a java class.

2) Freight calculation based on package volume: Given the width, length and
package height, and an aliquot (you may consider $ 5.00 in this example), freight is
calculated as follows:

- Up to 10 cm 3 - freight = aliquot
- Greater than 10 cm 3 up to 100 cm 3 - freight = aliquot + 0.10 * volume
- Above 100cm 3 - freight = aliquot + 0.20 * volume

Both implementations uses Apache CXF™.  An open source services framework.

CXF helps to build and develop services using frontend programming APIs, like JAX-WS and JAX-RS.

## Model driven engineering

Verifies the applicability of model driven software development.

Considering a teacher that has a repository of multiple-choice questions and, for each question,
the correct alternative.

The project consists of a Metamodel and an instance* of the metamodel (object model) that will
be used when generating an exam.

The model represents a test developed by the teacher (a set of questions).

The goal of the project is:

make three different code-generators:

  - print the exam
  - print the correct answers
  - generate a Java program (or use another programming language of your choice) that allows the student to execute the exam using the computer and, when he finishes, prints the answers given.

Metal model was developed using Eclipse EMF and code generator as build using Acceleo.

The exam and correct answers was build in Markdown markup language and the program used to run an exam was developed targeting python language.
