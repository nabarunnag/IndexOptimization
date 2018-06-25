import com.gs.imd.concert.data.model.Portfolio;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;

public class DataLoader {

  public static ClientCacheFactory connect(String cacheXmlFilePath){
    return new ClientCacheFactory().set("cache-xml-file", cacheXmlFilePath);
  }


  public static void main(String[] args) {
    System.out.println("CLIENT: Creating the client cache factory");
    ClientCacheFactory clientCacheFactory = connect(args[0]);
    ClientCache clientCache = clientCacheFactory.create();
    ClientRegionFactory clientRegionFactory = clientCache.createClientRegionFactory(
        ClientRegionShortcut.PROXY);
    System.out.println("CLIENT: done creating the client cache factory");
    System.out.println("CLIENT: creating the regions");
    Region[] regions = getRegions(clientCache);
    System.out.println("CLIENT: completed creating the regions");
    System.out.println("CLIENT: putting values into the regions");
    for (int i = Integer.parseInt(args[1]); i < Integer.parseInt(args[2]); i++) {
      if(i % 10000 == 0){
        System.out.println("CLIENT: completed put operation for : " + i + " entries");
      }
      for (Region region: regions) {
        region.put(i+"", new Portfolio(i+""));
      }
    }
    System.out.println("CLIENT: Put operation completed.");
  }

  private static Region[] getRegions(ClientCache clientCache) {
    Region[] regions = new Region[RegionNames.regionList.length];
    for (int i = 0; i < RegionNames.regionList.length; i++) {

      regions[i] = clientCache.getRegion(RegionNames.regionList[i]);
      System.out.println(regions[i].getName());
    }
    return regions;
  }
}
