import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import worker.exception.InvalidExcelFileException;
import worker.exception.InvalidObjectFieldNameException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;


public class ExcelCellToObject
{
    /**
     * Read value from Cell and set it to given field of given object.
     * Note: supported data Type: String, Date, int, long, float, double and boolean.
     *
     * @param obj   Object whom given field belong.
     * @param field Field which value need to be set.
     * @param cell  Apache POI cell from which value needs to be retrived.
     */
    private void setObjectFieldValueFromCell(Object obj, Field field, Cell cell) {
        Class<?> cls = field.getType();
        field.setAccessible(true);
        DataFormatter formatter = new DataFormatter();

        if (cls == String.class) {
            try {
                field.set(obj, formatter.formatCellValue(cell).trim());
            } catch (Exception e) {
                try {
                    field.set(obj, null);
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }
        } else if (cls == Date.class) {
            try {
                Date date = cell.getDateCellValue();
                field.set(obj, date);
            } catch (Exception e) {
                try {
                    field.set(obj, null);
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }
        } else if (cls == int.class || cls == long.class || cls == float.class || cls == double.class) {
            double value = cell.getNumericCellValue();
            try {
                if (cls == int.class) {
                    field.set(obj, (int) value);
                } else if (cls == long.class) {
                    field.set(obj, (long) value);
                } else if (cls == float.class) {
                    field.set(obj, (float) value);
                } else {
                    //Double value
                    field.set(obj, value);
                }
            } catch (Exception e) {
                try {
                    field.set(obj, null);
                } catch (IllegalAccessException e1) {
                    System.out.println("- ");
                    e1.printStackTrace();
                }
            }
        } else if (cls == boolean.class) {
            boolean value = cell.getBooleanCellValue();
            try {
                field.set(obj, value);
            } catch (Exception e) {
                try {
                    field.set(obj, null);
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            }
        }

        else {
            System.out.println("Unsupported Data Type")
            exit();
        }

    }
}