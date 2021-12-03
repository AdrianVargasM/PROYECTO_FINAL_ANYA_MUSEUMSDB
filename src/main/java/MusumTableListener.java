/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class MusumTableListener implements TableModelListener  {
    
    private final Database db;
    private String table;
    private String columnKey;
    
    public MusumTableListener(Database d, String table, String columnKey) {
        super();
        db = d;
        this.table = table;
        this.columnKey = columnKey;
    }



    @Override
    public void tableChanged(TableModelEvent event) {
        JDBCTableAdpater modelo = (JDBCTableAdpater) event.getSource();        
       
        int row = event.getFirstRow();
        int column = event.getColumn();
        int type = event.getType();
        
        //No se puede modificar una clave primaria
        if( column == 0  ) {
            return;
        }      

        String sql = String.format(
                "UPDATE \""+table+"\" SET \"%s\" = \'%s\' WHERE \""+ columnKey +"\" = \'%s\'",
                db.getColumnName(column,table),modelo.getValueAt(row, column), modelo.getValueAt(row, 0));

        try {
            db.update(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(sql);
    }
    
    
}
