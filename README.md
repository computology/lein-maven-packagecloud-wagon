# Leiningen Packagecloud Maven Wagon

### NOTE: this is currently in beta

## Usage

**Visit [packagecloud.io/api_token](packagecloud.io/api_token) and get your API token before proceeding.**

#### Add the wagon plugin to the `:plugins` section of your `project.clj`
```clj
:plugins [[lein-maven-packagecloud-wagon "0.0.1"]]
```

#### Set up your `:deploy-repositories` to point to your packagecloud repository, like so:

(We are setting our snapshot and release repositories to the same, feel free to make them different)

```clj
:deploy-repositories [["releases" {:url "packagecloud-https://packagecloud.io/myuser/myrepo"}]
                      ["snapshots" {:url "packagecloud-https://packagecloud.io/myuser/myrepo"}]]
```

#### Add your API token to the `:auth` profile in `~/.lein/profiles.clj`

```xml
{:auth {:repository-auth {#"packagecloud.*" {:username "" :password "009a80sd8as98a99980s0s9s"}}}}
```

#### `lein deploy`
That's it!
