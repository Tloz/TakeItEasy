package pobj.partiel2013nov;

public class PoolQ3 extends Pool implements I3{

	@Override
	public PieceEq get(int i) {
		if (mask[i])
			return pool[i];
		else return null;
	}

	@Override
	public PieceEq remove(int i) {
		if (mask[i])
		{
			mask[i] = false;
			return pool[i];
		}
		else return null;
	}

	@Override
	public int indexOf(PieceEq pe) {
		int index;
		for(index = 0; index < pool.length; index++)
			if ((pool[index].equals(pe)) && (mask[index]))
				return index;
				
		return -1;
	}

	@Override
	public PieceEq remove(PieceEq pe) {
		int index = indexOf(pe);
		if(index != -1)
		{
			return remove(index);
		}
		return null;
	}

}
