/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer
{
	public final native long AddRef();
	
	protected IUnknown(ti var_ti) {
		reference = new IUnknownReference(this, var_ti);
	}
	
	public final long a(int i) {
		int i_0_ = -25 % ((i - -18) / 42);
		return super.a();
	}
}
