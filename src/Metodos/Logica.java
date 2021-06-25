package Metodos;

import clases.Articulo;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Logica {

    ObjectContainer db;
    ObjectSet<Articulo> resultadoConsulta;
    private final String ruta = "datos.yap";

    public void altas(Articulo nuevoArticulo) {
        // Creamos la base de datos y establecemos conexion
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), ruta);
        //Añadimos el objeto a la bd
        db.store(nuevoArticulo);
        //Cerramos la conexión
        db.close();
    }

    public void mostarTodos(Articulo articulo, JTextArea jtmostrar) {

        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), ruta);

        jtmostrar.setText("");
        resultadoConsulta = db.queryByExample(articulo);

        while (resultadoConsulta.hasNext()) {
            Articulo articuloActual = resultadoConsulta.next();
            jtmostrar.append("Codigo del artículo: " + articuloActual.getCodigo() + "\n"
                    + "Nombre: " + articuloActual.getNombre() + "\n"
                    + "Cantidad: " + articuloActual.getCantidad() + "\n"
                    + "Descripción: " + articuloActual.getDescripcion()
                    + "\n-------------------------------------" + "\n");

        }
        db.close();

    }

    public void buscar(Articulo articulo, JTextField codigo, JTextField nombre, JTextField cantidad, JTextPane descripcion) {

        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), ruta);

        resultadoConsulta = db.queryByExample(articulo);
        if (resultadoConsulta.size() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el producto", "No se ha encontrado", JOptionPane.ERROR_MESSAGE);
        } else {
            while (resultadoConsulta.hasNext()) {
                Articulo articuloActual = resultadoConsulta.next();

                codigo.setText(String.valueOf(articuloActual.getCodigo()));
                nombre.setText(articuloActual.getNombre());
                cantidad.setText((String.valueOf(articuloActual.getCantidad())));
                descripcion.setText(articuloActual.getDescripcion());

            }
        }
        db.close();

    }

    public void borrarArticulo(Articulo borrar) {
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), ruta);

        resultadoConsulta = db.queryByExample(borrar);
        if (resultadoConsulta.size() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el producto que se desea borrar", "No se ha encontrado", JOptionPane.ERROR_MESSAGE);
        } else {
            while (resultadoConsulta.hasNext()) {
                Articulo articuloActual = resultadoConsulta.next();
                int decision = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere borrar el articulo?", "Borrar producto", JOptionPane.YES_OPTION, JOptionPane.YES_NO_OPTION);

                if (decision == JOptionPane.YES_OPTION) {
                    db.store(articuloActual);
                    db.delete(articuloActual);
                }

            }
        }

        db.close();
    }

    public void modificar(Articulo modificar, JTextField codigo, JTextField nombre, JTextField cantidad, JTextPane descripcion) {
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), ruta);
        resultadoConsulta = db.queryByExample(modificar);

        if (resultadoConsulta.size() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el producto que se desea modificar", "No se ha encontrado", JOptionPane.ERROR_MESSAGE);
        } else {
            while (resultadoConsulta.hasNext()) {
                Articulo articuloActual = resultadoConsulta.next();
                articuloActual.setCodigo(Integer.parseInt(codigo.getText()));
                articuloActual.setNombre(nombre.getText());
                articuloActual.setCantidad(Integer.parseInt(cantidad.getText()));
                articuloActual.setDescripcion(descripcion.getText());
                int decision = JOptionPane.showConfirmDialog(null, "¿Seguro que modificar el articulo?", "Modificar producto", JOptionPane.YES_OPTION, JOptionPane.YES_NO_OPTION);
                if (decision == JOptionPane.YES_OPTION) {
                    db.store(articuloActual);
                    nombre.setText("");
                    codigo.setText("");
                    cantidad.setText("");
                    descripcion.setText("");
                } else {
                    nombre.setText("");
                    codigo.setText("");
                    cantidad.setText("");
                    descripcion.setText("");
                }

            }

        }

        db.close();

    }
}
