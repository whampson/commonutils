/*
 * Copyright (C) 2014 Wes Hampson.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

package weshampson.commonutils.ansi;

/**
 *
 * @author  Wes Hampson
 * @version 0.1.0 (Aug 25, 2014)
 * @since   0.1.0 (Aug 25, 2014)
 */
public class ANSIException extends Exception {
    public ANSIException() {
        super();
    }
    public ANSIException(String message) {
        super(message);
    }
    public ANSIException(Throwable cause) {
        super(cause);
    }
    public ANSIException(String message, Throwable cause) {
        super(message, cause);
    }
}