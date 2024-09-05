import javax.swing.*;

public class ProgramaCompras {
        //Metodo principal
    public static void main(String[] args) {

        //Definir variables
        String NombreCliente;
        String NombreProducto;
        float ValorUnitario;
        Integer Cantidad;
        double ValorBruto;
        double ValorNeto;
        double ValorDescuento;

        //Capturar información
        NombreCliente = JOptionPane.showInputDialog(null, "Digite su nombre");
        NombreProducto = JOptionPane.showInputDialog(null, NombreCliente +
                " digite el nombre del producto que va a llevar: ");
        ValorUnitario = Float.parseFloat(JOptionPane.showInputDialog(null,
                NombreCliente + " digite el valor unitario del producto"));
        if (ValorUnitario <= 0){ //Si el valor unitario es menor o igual a cero
            JOptionPane.showMessageDialog(null, "" +
                    NombreCliente + " ingrese un valor mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,
                    NombreCliente + " ingrese la cantidad de " + NombreProducto +
                            " que desea llevar") );
            if (Cantidad <= 0){ //Si la cantidad es menor o igual a cero
                JOptionPane.showMessageDialog(null, "" +
                        NombreCliente + " la cantidad tiene que ser mayor 0"
                        , "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                //Se calcula el valor de la compra
                ValorBruto = (ValorUnitario * Cantidad);

                //Se calculan los descuentos
                if (Cantidad < 10) {
                    JOptionPane.showMessageDialog(null, NombreCliente + "" +
                            ", el total de su compra es de: " + ValorBruto);
                    else if (Cantidad >= 10 && Cantidad < 20){
                        ValorNeto = (ValorBruto * 0.95);{

                    } else {
                            ValorNeto = (ValorBruto * 0.93);
                        }
// Se me acabo el tiempo :((
                    }

                    }

                }

            }

        }

    }
}

