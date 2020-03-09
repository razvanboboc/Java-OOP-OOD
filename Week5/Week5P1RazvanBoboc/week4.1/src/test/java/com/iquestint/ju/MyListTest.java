package com.iquestint.ju;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.iquestint.ju.exceptions.CustomException;
import com.iquestint.ju.exceptions.InvalidNumberFormatException;
import com.iquestint.ju.exceptions.NullOrEmptyException;
import com.iquestint.ju.exceptions.OutOfBoundsException;
import com.iquestint.ju.list.List;
import com.iquestint.ju.list.StringList;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyListTest {

    private List<String> list;

    private Class<CustomException> exceptionType = CustomException.class;

    private String[] initData = {"12", "23", "34", "45"};

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        this.list = new StringList(initData.length);
    }

    @Test
    public void testAddValuesToTheList() {
        initData();
        assertEquals(initData.length, list.size());
        for (String data : initData) {
            assertTrue(list.contains(data));
        }
    }

    private void initData() {
        for (String numberAsString : initData) {
            list.add(numberAsString);
        }
    }

    @Test
    public void testAddNonIntegerValue() {
        exception.expect(InvalidNumberFormatException.class);
        exception.expectMessage("Invalid number.");
        list.add("Hey, I'm not an integer.");
    }

    @Test
    public void testAddNonNullValue() {
        exception.expect(NullOrEmptyException.class);
        exception.expectMessage("Null");
        list.add(null);
    }

    @Test
    public void testIndexOutOfBounds() {
        initData();
        exception.expect(OutOfBoundsException.class);
        exception.expectMessage("Index out of bounds.");
        list.get(initData.length);
    }
}
