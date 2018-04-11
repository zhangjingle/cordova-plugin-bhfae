//
//  Bhfae.m
//  Cordova
//
//  Created by 滨海金融 on 2018/4/11.
//

#import "Bhfae.h"

@implementation Bhfae

-(void)getAppVersion:(CDVInvokedUrlCommand *)command {
    NSString * appVersion = [[[NSBundle mainBundle]infoDictionary]objectForKey:@"CFBundleShortVersionString"];
    CDVPluginResult * result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:appVersion];
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
