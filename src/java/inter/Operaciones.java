/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

import java.util.List;

/**
 *
 */
public interface Operaciones <T>
{
    public int crear (T dato);
    public int editar (T dato);
    public int borrar (T dato);
    public int[] consultar ();
    //public List<T> consultar ();
}
