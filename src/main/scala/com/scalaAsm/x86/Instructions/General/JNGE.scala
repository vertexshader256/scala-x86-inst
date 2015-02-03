package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if less/not greater (SF!=OF)
// Category: general/branch/cond

object JNGE extends InstructionDefinition("JNGE") with JNGEImpl

trait JNGEImpl {
  implicit object JNGE_0 extends JNGE._1[rel8] {
    val opcode: OneOpcode = 0x7C
  }

  implicit object JNGE_1 extends JNGE._1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8C)
  }

  implicit object JNGE_2 extends JNGE._1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8C)
  }
}
