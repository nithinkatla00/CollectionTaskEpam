package com.maven.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Collection
{
	private static Logger LOG=LogManager.getLogger(Collection.class); 
    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        LOG.info(list);
        LOG.info( list.get(0));
        LOG.info( list.get(2));
	 list.remove(2);
	    
        LOG.info(list.size());
    }
}
