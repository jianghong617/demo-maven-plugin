package com.zero.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * {@code DemoMojo}
 *
 * @author jianghong
 * @date 2023/12/13
 * @since 1.2.0
 */
@Mojo(name = "demo")
public class DemoMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        this.getLog().info("hello my first maven plugin!");
    }
}