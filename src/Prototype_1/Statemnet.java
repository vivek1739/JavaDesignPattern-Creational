package Prototype_1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Statemnet implements Serializable,Cloneable {
	private String sql;
	private List<String> parameters;
	private Record record;

	public Statemnet(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public Statemnet deepclone() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.flush();
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			ois.close();
			oos.close();
			return (Statemnet) ois.readObject();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getSql() {
		return sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}

}
