package com.tms.lesson8.task1;

class Stack {
    private String[] stck;
    private int tos;

    // выделить память под стек и инициализировать его
    Stack(int size) {
        stck = new String[size];
        tos  = -1;
    }

    //разметить элемент в стеке
    void push(String item) throws ArrayIndexOutOfBoundsException {
        try {
            stck[++tos] = item;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is full.\n" + e);
        }
    }

    //извлечь элемент из стека
    String pop() {
        return stck[tos--];
    }
}

