package com.mycompany.arbolbinario;

public class NodoArbol<T extends Comparable<T>> {

    private T element;
    private NodoArbol<T> parent;
    private NodoArbol<T> left;
    private NodoArbol<T> right;

    public NodoArbol(T element) {
        this.element = element;
    }

    public NodoArbol(T element, NodoArbol<T> parent, NodoArbol<T> left, NodoArbol<T> right) {
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public NodoArbol(T element, NodoArbol<T> parent) {
        this.element = element;
        this.parent = parent;
    }

    public NodoArbol(T element, NodoArbol<T> left, NodoArbol<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodoArbol<T> getParent() {
        return parent;
    }

    public void setParent(NodoArbol<T> parent) {
        this.parent = parent;
    }

    public NodoArbol<T> getLeft() {
        return left;
    }

    public void setLeft(NodoArbol<T> left) {
        this.left = left;
    }

    public NodoArbol<T> getRight() {
        return right;
    }

    public void setRight(NodoArbol<T> right) {
        this.right = right;
    }

}
