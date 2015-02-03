package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/branch/cond

object JNLE extends InstructionDefinition("JNLE") with JNLEImpl

trait JNLEImpl {
  implicit object JNLE_0 extends JNLE._1[rel8] {
    val opcode: OneOpcode = 0x7F
  }

  implicit object JNLE_1 extends JNLE._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8F)
  }

  implicit object JNLE_2 extends JNLE._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8F)
  }
}
