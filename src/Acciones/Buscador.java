/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Acciones;

import Clases.Cancion;
import InterfazGrafica.JPrincipal;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;
import javax.swing.table.DefaultTableModel;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author PabloRuiz
 */
public class Buscador {

    private JFileChooser buscar;
    private javax.swing.filechooser.FileFilter filtro;
    private File file[];
    private ArrayList lista;
    private Cancion cancion;
    private DefaultTableModel model;
    private BasicPlayer player;

    public Buscador() {
        init();
    }

    public void init() {
        player = new BasicPlayer();

        buscar = new JFileChooser();
        lista = new ArrayList();

        model = new DefaultTableModel() {

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("Nombre");
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void buscarArchivo() {
        int contador = 0;
        filtro = new FileNameExtensionFilter("Archivos MP3(.mp3)", "MP3");
        buscar.setFileFilter(filtro);
        buscar.setAcceptAllFileFilterUsed(false);
        buscar.setFileHidingEnabled(true);
        buscar.setMultiSelectionEnabled(true);

        if (buscar.showOpenDialog(buscar) == JFileChooser.APPROVE_OPTION) {
            file = buscar.getSelectedFiles();

            for (int i = 0; i < file.length; i++) {
                cancion = new Cancion(contador, file[i].getName(), file[i].length(), file[i].getAbsolutePath());
                lista.add(cancion);
                String nombre[] = {cancion.getNombre()};
                model.addRow(nombre);
                contador++;
            }
        } else {
            buscar.cancelSelection();
        }
    }

    public ArrayList getLista() {
        return lista;
    }

    public void playSong(String cancion) throws BasicPlayerException {
        for (Iterator it = lista.iterator(); it.hasNext();) {
            Cancion song = (Cancion) it.next();
                if(cancion == null ? song.getNombre() == null : cancion.equals(song.getNombre())){
                player.open(new File(song.getDireccion()));
                player.play();
                }
        }
    }

    public void volumen(float a) throws BasicPlayerException{
        player.setGain(a);
    }

    public BasicPlayer getPlayer() {
        return player;
    }
}
