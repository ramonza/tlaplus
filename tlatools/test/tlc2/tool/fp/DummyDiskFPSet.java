// Copyright (c) 2011 Microsoft Corporation.  All rights reserved.
package tlc2.tool.fp;

import java.rmi.RemoteException;

/**
 * The sole purpose of this class is to broaden the visibility of
 * {@link DiskFPSet}#index for uni tests
 */
@SuppressWarnings("serial")
public class DummyDiskFPSet extends HeapBasedDiskFPSet {

	public DummyDiskFPSet(long maxRealMemInBytes) throws RemoteException {
		super(maxRealMemInBytes / FPSet.LongSize);
	}

	public void setIndex(long[] anIndex) {
		this.index = anIndex;
	}
}
