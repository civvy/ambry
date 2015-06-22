package com.github.ambry.restservice;

/**
 * NioServerFactory is a factory to generate all the supporting cast required to instantiate a {@link NioServer}.
 * <p/>
 * Usually called with the canonical class name and as such might have to support appropriate (multiple) constructors.
 */
public interface NioServerFactory {

  /**
   * Returns a new instance of the {@link NioServer} that the factory generates.
   * @return - an instance of {@link NioServer} generated by this factory.
   * @throws InstantiationException
   */
  public NioServer getNioServer()
      throws InstantiationException;
}
