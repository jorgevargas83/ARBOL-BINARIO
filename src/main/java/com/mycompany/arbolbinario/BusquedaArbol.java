package com.mycompany.arbolbinario;

public class BusquedaArbol<T extends Comparable<T>> {

    private NodoArbol<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public NodoArbol<T> getRoot() {
        return root;
    }

    public boolean isRoot(NodoArbol<T> nodo) {

        return root == nodo;
    }

    public boolean isLeaf(NodoArbol<T> nodo) {

        return nodo.getLeft() == null && nodo.getRight() == null;
    }

    public boolean isInternal(NodoArbol<T> nodo) {
        return !isLeaf(nodo);
    }

    public NodoArbol<T> add(NodoArbol<T> origen, T elemento) {

        NodoArbol<T> nodo = null;
        if (root == null) {

            root = new NodoArbol<>(elemento);
        } else {
            if (origen == null) {

                System.out.println("El origen es nulo");
            } else {

                if (origen.getElement().compareTo(elemento) > 0) {

                    if (origen.getLeft() != null) {
                        add(origen.getLeft(), elemento);
                    } else {
                        nodo = new NodoArbol<>(elemento);
                        nodo.setParent(origen);
                        origen.setLeft(nodo);
                    }

                } else {

                    if (origen.getRight() != null) {
                        add(origen.getRight(), elemento);
                    } else {
                        nodo = new NodoArbol<>(elemento);
                        nodo.setParent(origen);
                        origen.setRight(nodo);
                    }

                }
            }

        }
        return nodo;
    }

    public NodoArbol<T> add(T elemento) {

        NodoArbol<T> nodo = null;
        if (root == null) {

            root = new NodoArbol<>(elemento);
        } else {

            NodoArbol<T> aux = root;
            boolean insertado = false;
            while (!insertado) {

                if (aux.getElement().compareTo(elemento) > 0) {

                    if (aux.getLeft() != null) {
                        aux = aux.getLeft();
                    } else {
                        nodo = new NodoArbol<>(elemento);
                        nodo.setParent(aux);
                        aux.setLeft(nodo);
                        insertado = true;
                    }

                } else {

                    if (aux.getRight() != null) {
                        aux = aux.getRight();
                    } else {
                        nodo = new NodoArbol<>(elemento);
                        nodo.setParent(aux);
                        aux.setRight(nodo);
                        insertado = true;
                    }

                }

            }

        }
        return nodo;
    }

    public void preorder(NodoArbol<T> nodo) {

        System.out.println(nodo.getElement().toString());
        if (nodo.getLeft() != null) {

            preorder(nodo.getLeft());
        }

        if (nodo.getRight() != null) {
            preorder(nodo.getRight());
        }

    }

    public void inorder(NodoArbol<T> nodo) {

        if (nodo.getLeft() != null) {

            preorder(nodo.getLeft());
        }

        System.out.println(nodo.getElement().toString());

        if (nodo.getRight() != null) {
            preorder(nodo.getRight());
        }

    }

    public void postorder(NodoArbol<T> nodo) {

        if (nodo.getLeft() != null) {

            preorder(nodo.getLeft());
        }

        if (nodo.getRight() != null) {
            preorder(nodo.getRight());
        }

        System.out.println(nodo.getElement().toString());

    }

}
