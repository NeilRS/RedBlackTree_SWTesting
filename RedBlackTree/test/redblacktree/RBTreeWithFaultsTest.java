/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Neil
 */
public class RBTreeWithFaultsTest {
    
    public RBTreeWithFaultsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRoot method, of class RBTreeWithFaults.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode result = instance.getRoot();
        assertNotNull(result);
    }

    /**
     * Test of empty method, of class RBTreeWithFaults.
     */
    @Test
    public void testEmpty() {
        System.out.println("Testing empty...");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        
        // The tree, with nothing in it, is empty.
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        
        //Add a node, then test is empty
        instance.insert(10, "value");
        expResult = false;
        result = instance.empty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int k = 10;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        
        String result = instance.search(k);
        assertNull(result);
        
        instance.insert(k, "value");
        String expResult = "value";
        result = instance.search(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of insert method, of class RBTreeWithFaults.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int k = 0;
        String v = "";
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.insert(k, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int k = 0;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.delete(k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class RBTreeWithFaults.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = "";
        String result = instance.min();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class RBTreeWithFaults.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = "";
        String result = instance.max();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxValue method, of class RBTreeWithFaults.
     */
    @Test
    public void testMaxValue() {
        System.out.println("maxValue");
        RBTreeWithFaults.RBNode node = null;
        String expResult = "";
        String result = RBTreeWithFaults.maxValue(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keysToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testKeysToArray() {
        System.out.println("keysToArray");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int[] expResult = null;
        int[] result = instance.keysToArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valuesToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testValuesToArray() {
        System.out.println("valuesToArray");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String[] expResult = null;
        String[] result = instance.valuesToArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class RBTreeWithFaults.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class RBTreeWithFaults.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeCalc method, of class RBTreeWithFaults.
     */
    @Test
    public void testSizeCalc() {
        System.out.println("sizeCalc");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = RBTreeWithFaults.sizeCalc(instance.getRoot());
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class RBTreeWithFaults.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RBTreeWithFaults.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInfinityNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testCreateInfinityNode_0args() {
        System.out.println("createInfinityNode");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.createInfinityNode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInfinityNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testCreateInfinityNode_RBTreeWithFaultsRBNode() {
        System.out.println("createInfinityNode");
        RBTreeWithFaults.RBNode leftchild = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.createInfinityNode(leftchild);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNullNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testCreateNullNode() {
        System.out.println("createNullNode");
        RBTreeWithFaults.RBNode parent = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.createNullNode(parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchNode() {
        System.out.println("SearchNode");
        int k = 0;
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.SearchNode(k, node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fixUpTree method, of class RBTreeWithFaults.
     */
    @Test
    public void testFixUpTree() {
        System.out.println("fixUpTree");
        RBTreeWithFaults.RBNode z = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.fixUpTree(z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftChild method, of class RBTreeWithFaults.
     */
    @Test
    public void testLeftChild() {
        System.out.println("leftChild");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults.RBNode y = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.leftChild(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightChild method, of class RBTreeWithFaults.
     */
    @Test
    public void testRightChild() {
        System.out.println("rightChild");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults.RBNode y = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.rightChild(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transplate method, of class RBTreeWithFaults.
     */
    @Test
    public void testTransplate() {
        System.out.println("transplate");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults.RBNode y = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.transplate(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leftRotate method, of class RBTreeWithFaults.
     */
    @Test
    public void testLeftRotate() {
        System.out.println("leftRotate");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.leftRotate(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightRotate method, of class RBTreeWithFaults.
     */
    @Test
    public void testRightRotate() {
        System.out.println("rightRotate");
        RBTreeWithFaults.RBNode y = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.rightRotate(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFixup method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteFixup() {
        System.out.println("deleteFixup");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.deleteFixup(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minimumNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testMinimumNode() {
        System.out.println("minimumNode");
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = RBTreeWithFaults.minimumNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInfinityNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testIsInfinityNode() {
        System.out.println("isInfinityNode");
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        boolean expResult = false;
        boolean result = instance.isInfinityNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNullNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testIsNullNode() {
        System.out.println("isNullNode");
        RBTreeWithFaults.RBNode node = null;
        boolean expResult = false;
        boolean result = RBTreeWithFaults.isNullNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArrayOfStringsToArrayOfInts method, of class RBTreeWithFaults.
     */
    @Test
    public void testArrayOfStringsToArrayOfInts() {
        System.out.println("ArrayOfStringsToArrayOfInts");
        String[] strArr = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int[] expResult = null;
        int[] result = instance.ArrayOfStringsToArrayOfInts(strArr);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ElementsToString method, of class RBTreeWithFaults.
     */
    @Test
    public void testElementsToString() {
        System.out.println("ElementsToString");
        RBTreeWithFaults.RBNode node = null;
        boolean key = false;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = "";
        String result = instance.ElementsToString(node, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
