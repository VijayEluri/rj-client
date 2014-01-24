/*=============================================================================#
 # Copyright (c) 2009-2014 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.rj.graphic;


/**
 * Configures filling paint color.
 */
public class RFillSetting extends RPaintSetting {
	
	
	public final int color;
	
	
	/**
	 * Creates a new fill setting.
	 * 
	 * @param color color
	 */
	public RFillSetting(final int color) {
		this.color = color;
	}
	
	
	@Override
	public final byte getInstructionType() {
		return SET_FILL;
	}
	
	
	public final int getAlpha() {
		return ((this.color >> 24) & 255);
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("RPaintFill[(");
		sb.append(this.color & 255);
		sb.append(", ");
		sb.append((this.color >> 8) & 255);
		sb.append(", ");
		sb.append((this.color >> 16) & 255);
		sb.append("), ");
		sb.append((this.color >> 24) & 255);
		sb.append("]");
		return sb.toString();
	}
	
}
