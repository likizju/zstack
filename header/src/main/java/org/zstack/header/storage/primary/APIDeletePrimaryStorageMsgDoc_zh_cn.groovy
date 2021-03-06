package org.zstack.header.storage.primary

doc {
    title "删除主存储(DeletePrimaryStorage)"

    category "storage.primary"

    desc "删除主存储"

    rest {
        request {
			url "DELETE /v1/primary-storage/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIDeletePrimaryStorageMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn ""
					desc "主存储的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "deleteMode"
 					enclosedIn "params"
 					desc "删除模式(Permissive 或者 Enforcing, 默认 Permissive)"
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn "params"
					desc "系统标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn "params"
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIDeletePrimaryStorageEvent.class
        }
    }
}